get_filename_component(pathToProject .. REALPATH)

cmake_minimum_required(VERSION 3.4.1)

set(CMAKE_VERBOSE_MAKEFILE on)
set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=gnu++11")

add_library( testing-lib SHARED src/main/cpp/testing-lib.cpp)
add_library( testing-lib-bridge SHARED src/main/jni/testing-lib-bridge.cpp)

find_library( log-lib log )

target_link_libraries( testing-lib ${log-lib} )
target_link_libraries( testing-lib-bridge testing-lib )
