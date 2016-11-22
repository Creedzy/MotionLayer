/**
 * Created by nas on 11/21/2016.
 */


angular.module('sbAdminApp')
    .controller('LoginController', ['$scope', '$timeout' ,'UserFactory', function ($scope, $timeout,User) {

        $scope.vars = {};

        $scope.user = null;

        $scope.sendingLoginData = false;

        $scope.loginByEmail = function() {
            $scope.sendingLoginData = true;
            User.login($scope.vars.email, $scope.vars.password, 'password').then(
                function() {
                    $timeout(function() {
                        $scope.sendingLoginData = false;
                        routeProvider.goTo('_next_', null, true);
                    }, 3000);

                },
                function(error) {
                    $scope.sendingLoginData = false;
                }
            );
        };

        $scope.toogleSendingLoginData = function() {

            $scope.sendingLoginData = !$scope.sendingLoginData;

        };



    }]);