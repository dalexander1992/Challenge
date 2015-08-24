<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.8/angular.min.js"></script>
        <script>
        
        var app = angular.module('myChallengeApp', []);

        function homePageController($scope, $http){
            
            $scope.getPlayersOne = function() {           
                $http({method: 'GET', url: '/playerone/list'}).
                success(function(data, status, headers, config) {
                    $scope.players = data;
                }).
                error(function(data, status, headers, config) {
                  console.log("Error");
                });
            
            };
        };
        </script>

</head>
<body>
	<div data-ng-app="myChallengeApp">
	        <div data-ng-controller="homePageController">
	            <button data-ng-click="getPlayersOne()">Get Person data from server</button>
	            <p>First Name : {{players.firstName}}</p>
	            <p>Last Name : {{players.lastName}}</p>
	        </div>
	</div>
</body>
</html>