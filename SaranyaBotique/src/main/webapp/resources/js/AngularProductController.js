var app = angular.module('myApp',[]);
app.controller('myCtrl',function($scope,$http){
	alert("angular controller found");
	$http.get("products")
	.then(function(response){
		alert("url found.....");
		$scope.data=response.data;
	});
	
});