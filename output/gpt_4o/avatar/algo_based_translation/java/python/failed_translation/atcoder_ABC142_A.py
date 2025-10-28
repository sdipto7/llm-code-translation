
import sys
import decimal

def main():
    try:
        input_value = input()
        input_float = float(input_value)
        
        count_odd = round(input_float / 2)
        
        result = decimal.Decimal(count_odd / input_float)
        result = result.quantize(decimal.Decimal('1.0000000000'), rounding=decimal.ROUND_HALF_UP)
        
        print(result)
        
    except (IOError, ValueError) as e:
        print(e, file=sys.stderr)
        sys.exit(0)
    except Exception as e:
        print(e, file=sys.stderr)
        sys.exit(0)

if __name__ == "__main__":
    main()

