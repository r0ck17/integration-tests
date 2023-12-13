package by.javaguru.mapper;

public interface Mapper <M, D> {

    D toDto(M from);
    M toModel(D from);
}
