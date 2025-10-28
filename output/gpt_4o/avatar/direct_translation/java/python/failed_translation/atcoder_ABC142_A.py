
import sys
from decimal import Decimal, ROUND_HALF_UP

try:
    input_value = sys.stdin.readline().strip()
    input_number = float(input_value)
    count_odd = round(input_number / 2)
    result = Decimal(count_odd / input_number).quantize(Decimal('1.0000000000'), rounding=ROUND_HALF_UP)
    print(result)
except (ValueError, ArithmeticError) as e:
    print(e, file=sys.stderr)
    sys.exit(0)
except Exception as e:
    print(e, file=sys.stderr)
    sys.exit(0)

