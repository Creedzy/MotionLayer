'use strict';
/**
 * @ngdoc function
 * @name sbAdminApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the sbAdminApp
 */
angular.module('sbAdminApp')
  .controller('MainCtrl',['$scope','UserFactory', function($scope,User) {


    $scope.vars = {};
    $scope.user = null;

    $scope.logFb = false;

    $scope.showUser = false;
    $scope.showDefault = false;

    User.getLoggedInUser().then(
        function(user) {
          $scope.user = user;
          $scope.showUser = true;
          $scope.showDefault = false;
        },
        function() {
          $scope.showUser = false;
          $scope.showDefault = true;
        }
    );

    $scope.logout = function() {

      User.logout().then(
          function() {
            routeProvider.goTo('/Login/dialog/appl/gng/wflow/showLogin', null, true);
          },
          function() {

          }
      );
      /*Facebook.logout(function(response) {
       console.log(response);
       scope.goTo(scope.urls.ggLogin);
       });*/
    };

  }]);
