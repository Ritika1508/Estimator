'use strict';

describe('Service: RegionService', function () {

  // load the service's module
  beforeEach(module('myApplicationApp'));

  // instantiate service
  var RegionService;
  beforeEach(inject(function (_RegionService_) {
    RegionService = _RegionService_;
  }));

  it('should do something', function () {
    expect(!!RegionService).toBe(true);
  });

});
