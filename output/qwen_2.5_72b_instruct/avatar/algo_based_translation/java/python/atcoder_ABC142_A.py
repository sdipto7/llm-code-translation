
import sys
from decimal import Decimal, ROUND_HALF_UP

def main():
    try:
        input_value = float(sys.stdin.readline().strip())
        count_odd = round(input_value / 2)
        result = Decimal(count_odd / input_value).quantize(Decimal('0.0000000000'), rounding=ROUND_HALF_UP)
        print(result)
    except (ValueError, IOError) as e:
        print(e)
        sys.exit(0)
    except Exception as e:
        print(e)
        sys.exit(0)

if __name__ == "__main__":
    main()

