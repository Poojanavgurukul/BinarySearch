#!/usr/bin/env bash
java BinarySearch 1 >actual
diff expectedOutputForInput1 actual
java BinarySearch 12 >actual
diff expectedOutputForInput12 actual