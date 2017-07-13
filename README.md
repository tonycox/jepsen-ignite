# Testing Ignite with Jepsen

## Getting Started
All tests placed in ./src, on docker container placed in /jepsen-ignite/src
written on [clojure](https://clojure.org/)

### Prerequisites
Requires any os with bash support and installed docker.
Ubuntu has some issues with docker networking,
see on [github](https://github.com/moby/moby/issues/1809).

In development we use clojure plugin for IDE and Leiningen.

### Installing
move into docker folder and 
run `build.sh` script, then
```
docker-compose up -d
```
**to stop all containers:**
```
docker kill $(docker ps -q)
```
or
```
docker-compose kill
```

## Running the tests
**to enter to jepsen-control container:**
```
docker exec -it jepsen-control bash
```
**to run a check tests:**
```
docker exec jepsen-control bash -c "cd /jepsen/jepsen && lein test"
```
**to run a jepsen-ignite tests:**
```
docker exec jepsen-control bash -c "cd /jepsen-ignite && lein test"
```