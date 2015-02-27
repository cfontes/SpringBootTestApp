
myApp.controller('RegisterController',
    function ($scope, $http, $location) {

        var self = this;

        $scope.register = function () {
            $http.post('users', {
                username: $scope.username,
                password: $scope.password
                }
            )
            .success(function (data) {
                $location.path("/");
            })
            .error(function (data) {
                $scope.error = true;
            })
        }
});