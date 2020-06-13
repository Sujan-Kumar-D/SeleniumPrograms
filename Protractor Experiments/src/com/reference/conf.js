exports.config = {
  // multiCapabilities: [{
  //   // seleniumAddress: 'http://localhost:4444/wd/hub',
  //   // name: 'firefox',
  //   // browserName: 'firefox',
  // },
  // {
  //   seleniumAddress: 'http://localhost:4444/wd/hub',
  //   // name: 'chrome',
  //   // browserName: 'chrome',
  //   shardTestFiles: true,
  //   maxInstances: 1
  // }],
  framework: 'jasmine',
  seleniumAddress: 'http://localhost:4444/wd/hub',
  specs: ['spec.js']

}
