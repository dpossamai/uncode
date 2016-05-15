(function () {
  'use strict';

  describe('Give it some context', function () {
    describe('maybe a bit more context here', function () {
      it('should run here few assertions', function () {
        expect(true).toBe(true);
      });
    });
  });
  
  describe('calculator', function () {
	  it('1 + 1 should equal 2', function() {
			expect(1 + 1).toBe(2);
		});
	});
  
})();
