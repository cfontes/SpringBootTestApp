
myApp.controller('LoginController',
    function ($rootScope, $scope, $http, $location) {

        $scope.authenticate = function (callback) {

            $http.get('users').success(function (data) {
                if (data.name) {
                    $rootScope.authenticated = true;
                } else {
                    $rootScope.authenticated = false;
                }
                callback && callback();
            }).error(function () {
                $rootScope.authenticated = false;
                callback && callback();
            });

        };

        $scope.authenticate();
        $scope.credentials = {};

        $scope.login = function () {
            $http.post('login', $scope.credentials, {

                headers : {
                    "content-type" : 'application/x-www-form-urlencoded; charset=UTF-8'
                },
                transformRequest: function(obj) {
                    var str = [];
                    for(var p in obj)
                        str.push(encodeURIComponent(p) + "=" + encodeURIComponent(obj[p]));
                    return str.join("&");
                }
            })
                .success(function (data) {
                $scope.authenticate(function () {
                    if ($rootScope.authenticated) {
                        $location.path("/");
                        $scope.error = false;
                    } else {
                        $location.path("/login");
                        $scope.error = true;
                    }
                });
            }).error(function (data) {
                $scope.error = true;
                $rootScope.authenticated = false;
            })
        };

        $scope.logout = function () {
            $http.post('logout', {}).success(function () {
                $rootScope.authenticated = false;
                $location.path("/");
            }).error(function (data) {
                $rootScope.authenticated = false;
            });
        }
    });
