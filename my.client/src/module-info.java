module my.client {
  requires java.base; // Redundant!!! required by default
  requires my.provider;
  // if I requires the modules for BOTH MyServiceInterface AND MyServiceImplementation
//  uses MyServiceInterface;
  // then there's a search mechanism for finding an Iterable of all the available implementations.
}