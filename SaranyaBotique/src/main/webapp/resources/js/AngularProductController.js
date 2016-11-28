var app = angular.module('myApp',[]);
app.controller('myCtrl',function($scope,$http){
	
	$http.get("products")
	.then(function(response){
		$scope.data=response.data;
	});
	
	$scope.sort=function(keyname){
		$scope.sortKey=keyname;
		
	}
});