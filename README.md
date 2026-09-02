Para adicionar um terceiro fornecedor (ex: WeatherApiXYZ):
1. Criar a classe WeatherApiXYZ (o "SDK" com sua própria assinatura de método).
2. Criar WeatherApiXYZAdapter implements PrevisaoService, convertendo o retorno para °C.
3. Nenhuma linha do PainelClima precisa mudar — ele continua dependendo só de PrevisaoService.