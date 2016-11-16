var app = angular.module('myApp',[]);
app.controller('myCtrl',function($scope,$http){
	$http.get("http://localhost:8080/SaranyaBotique/products")
	.then(function(response){
		$scope.data=response.data;
	});
	
});