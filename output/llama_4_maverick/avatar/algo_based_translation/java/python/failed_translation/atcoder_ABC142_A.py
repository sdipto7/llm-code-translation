
import sys

try:
    input_value = float(sys.stdin.readline().strip())
    count_odd = round(input_value / 2)
    result = count_odd / input_value
    print(format(result, '.10f'))
except (IOError, ValueError):
    import traceback
    traceback.print_exc()
    sys.exit(0)
except Exception:
    import traceback
    traceback.print_exc()
    sys.exit(0)

