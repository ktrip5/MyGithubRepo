import requests
import json
from dataclasses import dataclass
from dataclass_csv import DataclassReader,accept_whitespaces
from collections import namedtuple
from json import JSONEncoder
import csv
from csv import writer

class RestEOLDataProvider(object):

    def getEOLProduct(self,product,version):
            def customEOLJsonParser(eolDict):
                return namedtuple('X', eolDict.keys())(*eolDict.values())
            with open('C:\EOLfiles\EOLOutputFile_REST.csv','a', newline='') as newFile:
                thewriter=writer(newFile)
                try:
                    base_url='https://endoflife.date/api/{}.json'
                    url=base_url.format(product)
                    response = requests.get(url, timeout=5)
                    response.raise_for_status()
                    productList=response.json()
                    for list in productList:
                        eolJsonDict=json.dumps(list)
                        eolJsonObject=json.loads(eolJsonDict, object_hook=customEOLJsonParser)
                        if(version in eolJsonObject.latest):
                            eolProduct=eolJsonObject.eol
                            info=[product,eolJsonObject.latest,eolProduct]
                            #print(info)
                            thewriter.writerow(info)    

                except requests.exceptions.HTTPError as errh:
                    print(errh)
                except requests.exceptions.ConnectionError as errc:
                    print(errc)
                except requests.exceptions.Timeout as errt:
                    print(errt)
                except requests.exceptions.RequestException as err:
                    print(err)