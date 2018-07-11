var myApp = angular.module('ManHireApplication',[])
.controller('PlayerController',
function f($scope,$http) {

    $scope.player = {};
    $scope.playerList = [];
    $scope.openCloseNewPlayer = false;

    $scope.pageOpen = function()
    {
        $scope.findPlayer();
    }

    $scope.findPlayer = function ()
    {
        var hsn = $http.get('/api/player/find')
        hsn.then(function (response) {
            $scope.playerList =response.data;
        });
    }
    $scope.save = function ()
    {
        var h = $http.post("/api/player/save", $scope.player)
        h.then(function (response)
        {
            alert(response.data);
            $scope.findPlayer();
        });
    }
    $scope.selectPlayer = function (player)
    {
        $scope.player = player;

    }
    $scope.deletePlayer = function (ply)
    {
        $scope.player=ply;
        var hsn = $http.post("/api/player/delete",$scope.player)
        hsn.then(function (data)
        {
            $scope.player = {};
            $scope.findPlayer()
        })
    }
    // $scope.deletePlayerList = function (player)
    // {
    //     $scope.player= player
    //     #scope.deletePlayer(player)
    //     #scope.pageOpen()
    // }
});