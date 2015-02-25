/**
 * Created by cfontes on 19/02/2015.
 */
angular.module('login',[ 'ngRoute' ])
    .config(function($routeProvider) {

        $routeProvider
        .when('/', {
            templateUrl : 'partials/home.html',
            controller : 'home'
        }).when('/login', {
            templateUrl : 'partials/login.html',
            controller : 'navigation'
        }).otherwise('/');

    })

    .controller('home',

    function($scope, $http) {
        $http.get('/').success(function(data) {
            $scope.greeting = data;
        })
    })

    .controller('navigation',

    function($rootScope, $scope, $http, $location) {

        var authenticate = function(callback) {

            $http.get('users').success(function(data) {
                if (data.name) {
                    $rootScope.authenticated = true;
                } else {
                    $rootScope.authenticated = false;
                }
                callback && callback();
            }).error(function() {
                $rootScope.authenticated = false;
                callback && callback();
            });

        };

        authenticate();
        $scope.credentials = {};

        $scope.login = function() {
            $http.post('login', $scope.credentials, {
                headers : {
                    "content-type" : "application/x-www-form-urlencoded"
                }
            }).success(function(data) {
                authenticate(function() {
                    if ($rootScope.authenticated) {
                        $location.path("/");
                        $scope.error = false;
                    } else {
                        $location.path("/login");
                        $scope.error = true;
                    }
                });
            }).error(function(data) {
                $location.path("/login");
                $scope.error = true;
                $rootScope.authenticated = false;
            })
        };

        $scope.logout = function() {
            $http.post('logout', {}).success(function() {
                $rootScope.authenticated = false;
                $location.path("/");
            }).error(function(data) {
                $rootScope.authenticated = false;
            });
        }
    });