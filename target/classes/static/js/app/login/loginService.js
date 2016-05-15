(function() {
angular.module('com.sec21.service.login', []).service('LoginService', LoginService)
		
		
	function LoginService( $http) {
		var vm = {};
		vm.login = _login;
		
		function _login(username, password){
			console.log("Making login!");
			//TODO choose a authentication method
		}
		
		return vm;
	}
	

})();