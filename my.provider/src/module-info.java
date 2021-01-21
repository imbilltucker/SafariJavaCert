/*open*/ module my.provider {
  exports myservice;
//  exports myservice to my.client;
  opens myservice;
//  opens myservice to my.client;
  // IF a service is described by an interface "MyServiceInterface"
  // and that is in an exported package (though perhaps in anohter module)
  // and implemented by MyServiceImplementation in this module
  // which is in an unexported package
//  provides MyServiceInterface with MyServiceImplementation;
}