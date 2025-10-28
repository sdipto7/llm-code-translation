
import sys
import traceback
from decimal import Decimal, ROUND_HALF_UP, InvalidOperation

try:
    input_str = input().strip()
    n = Decimal(input_str)
    count_odd = (n / Decimal('2')).quantize(Decimal('0'), rounding=ROUND_HALF_UP)
    result = (count_odd / n).quantize(Decimal('0.0000000000'), rounding=ROUND_HALF_UP)
    print(result)
except (EOFError, InvalidOperation):
    traceback.print_exc()
    sys.exit(0)
except Exception:
    traceback.print_exc()
    sys.exit(0)

