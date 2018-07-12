var myApp = angular.module('ManHireApplication',[])
    .controller('CustomerController',
        function f($scope,$http)
        {
            $scope.customer = {};
            $scope.customerList = [];

            $scope.pageOpen = function()
            {
                $scope.findCustomer();
            }

            $scope.findCustomer = function()
            {
                var hsn = $http.get('/api/customer/find')
                hsn.then(function (response) {
                    $scope.customerList =response.data;
                });
            }
            $scope.save = function ()
            {
                var h = $http.post("/api/customer/save", $scope.customer)
                h.then(function (response)
                {
                    alert(response.data);
                    $scope.findCustomer();
                });
            }
            $scope.selectCustomer = function (customer)
            {
                $scope.customer = customer;

            }
            $scope.deleteCustomer = function (cs)
            {
                $scope.customer=cs;
                var hsn = $http.post("/api/customer/delete",$scope.customer)
                hsn.then(function (data)
                {
                    $scope.customer = {};
                    $scope.findCustomer()
                })
            }

        });