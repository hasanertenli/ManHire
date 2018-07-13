var myApp = angular.module('ManHireApplication', [])
    .controller('PlayerController',
        function f($scope, $http) {

            $scope.player = {};
            $scope.playerList = [];
            $scope.denemeList = "";
            $scope.player.position = {};
            $scope.player.positionList = [];
            $scope.arrayList = [];
            $scope.openCloseNewPlayer = false;

            $scope.pageOpen = function () {
                $scope.findPlayer();
                $scope.findPosition();
            }

            $scope.findPlayer = function () {
                var hsn = $http.get('/api/player/find')
                hsn.then(function (response) {
                    $scope.playerList = response.data;
                });
            }
            $scope.save = function () {
                for(var i=0; i<$scope.player.positionList.length;i++)
                {
                    if($scope.player.positionList[i].positionName===$scope.denemeList.positionName)
                    {
                        toaster.pop("Deneme");
                    }
                }
                $scope.player.positionList.push($scope.denemeList)

                var h = $http.post("/api/player/save", $scope.player)
                h.then(function (response) {
                    alert(response.data);
                    $scope.player = {};
                    $scope.denemeList = "";
                    $scope.findPlayer();
                });
            }
            $scope.selectPlayer = function (player) {
                $scope.player = player;

            }
            $scope.deletePlayer = function (ply) {
                $scope.player = ply;
                var hsn = $http.post("/api/player/delete", $scope.player)
                hsn.then(function (data) {
                    $scope.player = {};
                    $scope.findPlayer()
                })
            }
            $scope.findPosition = function () {
                var pos = $http.get('/api/position/find')
                pos.then(function (response) {
                    $scope.positionList = response.data;
                });
            }
            $scope.deneme = function (s)
            {
                $scope.player.position = s;
                var hsn = $http.post("/api/position/delete", $scope.player.position)
                hsn.then(function (value) {

                })

            }

        });