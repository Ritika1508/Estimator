'use strict';

describe('Controller: UsecasestabCtrl', function () {

  // load the controller's module
  beforeEach(module('myApplicationApp'));

  var UsecasestabCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    UsecasestabCtrl = $controller('UsecasestabCtrl', {
      $scope: scope
      // place here mocked dependencies
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(UsecasestabCtrl.awesomeThings.length).toBe(3);
  });
});
