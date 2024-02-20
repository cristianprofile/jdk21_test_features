package com.example.demojdk21;

enum Vehicle {
  CAR, BUS, TRAIN;

  int process() {
    return switch (this) {
      case CAR -> 0;
      case BUS -> 180;
      case TRAIN -> 90;
    };
  }
}
