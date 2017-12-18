'use strict';

describe('Filter: SplitFilter', function () {

  // load the filter's module
  beforeEach(module('myApplicationApp'));

  // initialize a new instance of the filter before each test
  var SplitFilter;
  beforeEach(inject(function ($filter) {
    SplitFilter = $filter('SplitFilter');
  }));

  it('should return the input prefixed with "SplitFilter filter:"', function () {
    var text = 'angularjs';
    expect(SplitFilter(text)).toBe('SplitFilter filter: ' + text);
  });

});
