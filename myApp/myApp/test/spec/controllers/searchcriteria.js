'use strict';

describe('Controller: SearchcriteriaCtrl', function () {

  // load the controller's module
  beforeEach(module('myApplicationApp'));

  var SearchcriteriaCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    SearchcriteriaCtrl = $controller('SearchcriteriaCtrl', {
      $scope: scope
      // place here mocked dependencies
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(SearchcriteriaCtrl.awesomeThings.length).toBe(3);
  });
});
