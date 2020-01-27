package com.example.mongodbdemo;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("event")
@RequiredArgsConstructor
@Getter
@Setter
public class EventDoc {
    @Id
    private String _id;
    @NonNull
    private String title;
    @NonNull
    private String image;

}
