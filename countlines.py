import os
import os.path
rootdir = "."
for parent,dirnames,filenames in os.walk(rootdir):
	for dirname in dirnames:
		print(dirname)
	for filename in filenames:
		print(parent + filename)