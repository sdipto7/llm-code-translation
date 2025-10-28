
import sys
from decimal import Decimal, ROUND_HALF_UP

def main():
    try:
        input = float(sys.stdin.readline())
        count_odd = round(input / 2)
        result = Decimal(count_odd / input)
        result = result.quantize(Decimal('0.0000000001'), rounding=ROUND_HALF_UP)
        print(result)
    except (ValueError, IOError) as e:
        sys.exit()
    except Exception as e:
        sys.exit()

if __name__ == "__main__":
    main()

