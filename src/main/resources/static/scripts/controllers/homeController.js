/**
 * Created by cfontes on 25/02/2015.
 */
myApp.controller('HomeController',
    function ($scope, $http) {
        $http.get('/home').success(function (data) {
            $scope.greeting = data;
        })
});