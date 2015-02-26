/**
 * Created by cfontes on 25/02/2015.
 */
myApp.config(function($routeProvider) {
    $routeProvider
        .when('/', {
            templateUrl : 'partials/home.html',
            controller : 'HomeController'
        }).when('/login', {
            templateUrl : 'partials/login.html',
            controller : 'LoginController'
        }).otherwise('/');
});