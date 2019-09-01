## How to use it
* `cd core;`
* `bitbake -b helloworld.bb` 或者 `bitbake helloworld`
* `bitbake -c install helloworld` `bitbake -c clean helloworld` `bitbake -c build helloworld`

## build all
1. `bitbake world` (core, mylayer)

## log
```
NOTE: Not using a cache. Set CACHE = <directory> to enable.
Parsing recipes: 100% |#######################################################| Time: 0:00:00
Parsing of 2 .bb files complete (0 cached, 2 parsed). 2 targets, 0 skipped, 0 masked, 0 errors.
NOTE: Resolving any missing task queue dependencies
Initialising tasks: 100% |####################################################| Time: 0:00:00
NOTE: No setscene tasks
NOTE: Executing Tasks
********************
*
*  Hello, World! this is core   *
*                  *
********************
Hello, build mylayer!
NOTE: Tasks Summary: Attempted 2 tasks of which 0 didn't need to be rerun and all succeeded.
```

