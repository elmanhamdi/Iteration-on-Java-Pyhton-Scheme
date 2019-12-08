list = ["aa","ba","ac"]
sortedlist = sorted(list)
print(sortedlist)
i = -1

def hasNext():
    if (i < len(sortedlist) - 1):
        return True
    else:
        return False

def next():
    if hasNext():
        global i
        i += 1
        return sortedlist[i]

    else:
        return -1

print(hasNext())
print(next())
print(hasNext())
print(next())
print(hasNext())
print(next())
print(hasNext())
print(next())
print(hasNext())
print(next())