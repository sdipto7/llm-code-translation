import sys
import math
from decimal import Decimal, ROUND_HALF_UP

def main():
    try:
        input_val = float(sys.stdin.readline().strip())
        count_odd = round(input_val / 2)
        result = Decimal(count_odd / input_val)
        result = result.quantize(Decimal('0.0000000001'), rounding=ROUND_HALF_UP)
        print(result)
    except (IOError, ValueError) as e:
        print(e, file=sys.stderr)
        sys.exit(0)
    except Exception as e:
        print(e, file=sys.stderr)
        sys.exit(0)

if __name__ == "__main__":
    main()
