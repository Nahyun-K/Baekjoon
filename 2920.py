array = list(map(int, input().split()))
asc = sorted(array, reverse=False)
desc = sorted(array, reverse=True)

if array == asc:
    print("ascending")
elif array == desc:
    print("descending")
else:
    print("mixed")

