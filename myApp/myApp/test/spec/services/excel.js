'use strict';

describe('Service: Excel', function () {

  // load the service's module
  beforeEach(module('myApplicationApp'));

  // instantiate service
  var Excel;
  beforeEach(inject(function (_Excel_) {
    Excel = _Excel_;
  }));

  it('should do something', function () {
    expect(!!Excel).toBe(true);
  });

});
