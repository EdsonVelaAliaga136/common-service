package com.evela.common_service.http;
//import org.springframework.web.reactive.function.client.WebClient;
//import org.springframework.web.reactive.function.client.WebClientResponseException;

public class HttpClient {
    /*private final WebClient webClient;

    public HttpClient(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.build();
    }

    public <T> T get(String url, Class<T> responseType) {
        try {
            return webClient.get()
                    .uri(url)
                    .retrieve()
                    .bodyToMono(responseType)
                    .block();
        } catch (WebClientResponseException ex) {
            throw new RuntimeException("Error fetching data from " + url, ex);
        }
    }*/
}
