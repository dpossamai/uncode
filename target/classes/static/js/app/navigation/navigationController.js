(function() {
	angular.module('com.sec21.controller.navigation', ['angularModalService']).controller(
			'NavigationCtrl', NavigationController)

	function NavigationController($scope,ModalService) {
		var vm = {};
		vm.showLoginModal = _showLoginModal;
		$scope.showModal = _showLoginModal;
		
		function _showLoginModal() {
			
			ModalService.showModal({
	            templateUrl: 'js/app/login/login.html',
	            controller: "LoginCtrl"
	        }).then(function(modal) {
	        	console.log(modal);
	            modal.element.modal();
	            modal.close.then(function(result) {
	                $scope.message = "You said " + result;
	            });
	        });
		}
		return vm;
		
	}

})();