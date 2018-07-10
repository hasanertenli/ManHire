var myApp = angular.module('ManHireApplication',[])
.controller('PlayerController',
function f($scope,$http) {

    $scope.player = {};
    $scope.playerList = [];

    $scope.pageOpen = function()
    {
        $scope.findPlayer();
    }

    $scope.findPlayer = function ()
    {
        var hsn = $http.get('/api/player/find')
        hsn.then(function (response) {
            $scope.playerList =response.data;
        })
    }


});