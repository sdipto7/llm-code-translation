
def main():
    import sys
    import bisect
    import math
    import sys
    import bisect
    import math
    from collections import *

    import sys
    from collections import *

    import sys
    from collections import *

    import sys
    from collections import *

    import sys
    from collections import *

    import sys
    from collections import *

    import sys
    from collections import *

    import sys
    from collections import *

    import sys
    from collections import *

    import sys
    from collections import *

    import sys
    from collections import *

    import sys
    from collections import *

    import sys
    from collections import *

    import sys
    from collections import *

    n = int(input().strip())
    array = list(map(int, input().strip().split()))
    array.sort()
    head = len(array) - 2
    res = 0
    for _ in range(n):
        res += array[head]
        head -= 2
    print(res)

if __name__ == "__main__":
    main()

