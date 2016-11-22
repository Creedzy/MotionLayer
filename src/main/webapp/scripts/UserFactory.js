/**
 * Created by nas on 11/21/2016.
 */

/* jshint -W097 */
'use strict';
angular.module('FactoryModule')

    .factory('UserFactory', ['$q', '$http', '$resource' , function ($q, $http, $resource) {

        function User(data) {

            this.id = null;
            this.username = null;
            this.firstname = null;
            this.lastname = null;
            this.facebookid = null;

            this.init = function(data) {

                this.id = data.a1uniqueid;
                this.username = data.username;
                this.firstname = data.givenname;
                this.lastname = data.familyname;

                if (angular.isDefined(data.facebookid) && data.facebookid) {
                    this.facebookid = data.facebookid;
                }

            };

            this.init(data);

        }

        User.login = function(mail, passwd, loginType) {

            console.log('send login information');

            var deferred =  $q.defer();

            var data = {
                attributes: {
                    username: mail,
                    password: passwd,
                    loginmethod: loginType
                }
            };

            $http.post('/Login/rest/appl/gng/wflow/gnglogin', data).then(
                function(data) {
                    console.log('login success');
                    deferred.resolve(data);
                },
                function(errors) {
                    console.log('login failed');
                    deferred.reject(errors);
                }
            );

            return deferred.promise;

        };

        User.logout = function() {

            console.log('logout');

            var deferred =  $q.defer();

            $http.get('/Login/rest/appl/gng/wflow/logout').then(
                function(data) {
                    console.log('logout success');
                    deferred.resolve(data);
                },
                function(errors) {
                    console.log('logout failed');
                    deferred.reject(errors);
                }
            );

            return deferred.promise;

        };

        User.getLoggedInUser = function() {

            console.log('get logged in user information');

            var deferred =  $q.defer();

            $http.get('/Login/rest/appl/users/wflow/getuserdetails').then(
                function(response) {
                    console.log('logged in user  success');
                    console.log(response);
                    var user = new GgUser(response.data);
                    deferred.resolve(user);
                },
                function(errors) {
                    console.log('logged in user failed');
                    deferred.reject(errors);
                }
            );

            return deferred.promise;

        };

        return User;

    }]);