package com.payroll.payrollproject.Payroll;


class OrderNotFoundException extends RuntimeException {

    OrderNotFoundException(Long id) {
      super("Could not find employee " + id);
    }
  }
