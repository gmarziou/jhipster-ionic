'use strict';

angular.module('jhipsterApp')
    .config(function ($stateProvider) {
        $stateProvider
            .state('error', {
                parent: 'site',
                url: '/error',
                data: {
                    roles: [],
                    pageTitle: 'Error page!'
                },
                views: {
                    'content@': {
                        templateUrl: 'scripts/app/error/error.html'
                    }
                },
                resolve: {
                    
                }
            })
            .state('accessdenied', {
                parent: 'site',
                url: '/accessdenied',
                data: {
                    roles: []
                },
                views: {
                    'content@': {
                        templateUrl: 'scripts/app/error/accessdenied.html'
                    }
                },
                resolve: {
                    
                }
            });
    });
