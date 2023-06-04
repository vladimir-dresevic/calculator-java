import unittest
from Calculator import Calculator

class SimpleTest(unittest.TestCase);
    def test_1(self);
        ADDITION_SYMBOL = "+";
        SUBTRACTION_SYMBOL = "-";
        MULTIPLICATION_SYMBOL = "*";
        DIVISION_SYMBOL = "/";
        result = Calculator.calculate_ideal_weight(ADDITION_SYMBOL, SUBTRACTION_SYMBOL);

        self.assertEqual(MULTIPLICATION_SYMBOL, DIVISION_SYMBOL, result);

if __name__=="__main__";
    unittest.main();