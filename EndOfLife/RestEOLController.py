import requests
from bs4 import BeautifulSoup

import csv
from csv import writer,reader



from datetime import datetime
from datetime import timezone

from dataclasses import dataclass
from dataclass_csv import DataclassReader,accept_whitespaces

from RestEOLDataProvider import RestEOLDataProvider

@accept_whitespaces
@dataclass
class InputParams:
    PRODUCT: str
    VERSION: str

with open('C:\EOLfiles\EOLOutputFile_REST.csv','w', newline='') as f:
    thewriter=writer(f)
    header=['Product','Vesrion','EndOfLife']
    thewriter.writerow(header)

with open('C:\EOLfiles\EOLInputFile_API.csv','r') as csv_file:
    csv_reader=DataclassReader(csv_file,InputParams,validate_header=False)
    for row in csv_reader:
        product=row.PRODUCT
        version=row.VERSION
        objEOL=RestEOLDataProvider()
        objEOL.getEOLProduct(product,version)

