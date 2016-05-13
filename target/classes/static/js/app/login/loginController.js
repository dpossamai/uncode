(function() {
angular.module('com.sec21.controller.login', []).controller('LoginCtrl', LoginController)
		
		
	function LoginController($scope, close) {
		var vm = {};
		vm.close = _close;
		
		function _close(result){
			close(result, 500); // close, but give 500ms for bootstrap to animate
		}
	}
	

})();