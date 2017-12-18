'use strict';

describe('Controller: PopulateusecaseCtrl', function () {

  // load the controller's module
  beforeEach(module('myApplicationApp'));

  var PopulateusecaseCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    PopulateusecaseCtrl = $controller('PopulateusecaseCtrl', {
      $scope: scope
      // place here mocked dependencies
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(PopulateusecaseCtrl.awesomeThings.length).toBe(3);
  });
});
