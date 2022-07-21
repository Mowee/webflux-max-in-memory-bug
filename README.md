
# Repository for issue report

This repository served the purpose of [reporting a "bug"](https://github.com/spring-projects/spring-boot/issues/31835) and isolating it in a reproducible way. However, in this case the code works as intended. This repository is now only used for documentation.

Raise the maxInMemorySize via:

    spring:  
      codec:  
        max-in-memory-size: 20MB
