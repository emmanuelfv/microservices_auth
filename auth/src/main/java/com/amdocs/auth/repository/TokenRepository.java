package com.amdocs.auth.repository;

import com.amdocs.auth.models.TokenModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenRepository extends CrudRepository<TokenModel, Long>  {

    public TokenModel findTokenByTokenId(String tokenId);

}
